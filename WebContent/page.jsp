<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<input type="text" id="inmessage"> <input type="submit"
			value="Start" onclick="start()" />
	</div>
	<div id="messages"></div>
	<script type="text/javascript">
		var webSocket = new WebSocket('ws://127.0.0.1:9090/weblog/websocket');

		webSocket.onerror = function(event) {
			onError(event)
		};

		webSocket.onopen = function(event) {
			onOpen(event)
		};

		webSocket.onmessage = function(event) {
			onMessage(event)
		};

		function onMessage(event) {
			document.getElementById('messages').innerHTML += '<br />'
					+ event.data;
		}

		function onOpen(event) {
			document.getElementById('messages').innerHTML = '已连接';
		}

		function onError(event) {
			alert(event.data);
		}

		function start() {
			webSocket.send(document.getElementById('inmessage').value);
			return false;
		}
	</script>
</body>
</html>