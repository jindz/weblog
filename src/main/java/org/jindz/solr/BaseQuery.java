package org.jindz.solr;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.solr.common.StringUtils;

public abstract class BaseQuery {

	public String toQueryString() {

		StringBuffer sub = new StringBuffer();

		try {
			Field[] fieldList = this.getClass().getDeclaredFields();
			for (int i = 0; i < fieldList.length; i++) {
				if (!fieldList[i].isAnnotationPresent(
						org.apache.solr.client.solrj.beans.Field.class)) {
					continue;
				}
				Method method = this.getClass().getDeclaredMethod(
						getMethodName(fieldList[i].getName()));
				Object value = method.invoke(this);
				if (value != null && !StringUtils.isEmpty(String.valueOf(value))) {
					sub.append(fieldList[i].getName()).append(":").append(method.invoke(this));
					if (i < fieldList.length - 2) {
						sub.append(" AND ");
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sub.toString();
	}

	private static String getMethodName(String fid) {
		return "get" + fid.substring(0, 1).toUpperCase() + fid.substring(1, fid.length());
	}
}
