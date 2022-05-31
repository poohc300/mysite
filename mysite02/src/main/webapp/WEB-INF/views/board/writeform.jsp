<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="<%=request.getContextPath() %>/assets/css/user.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div id="content">
			<div id="user">
				<form id="write-form" name="writeForm" method="post" action="<%=request.getContextPath() %>/board?a=write">
					<label class="block-label" for="title">유저번호</label>
					<input id="userNo" name="userNo" type="text" value="1">
					
					<label class="block-label" for="title">제목</label>
					<input id="title" name="title" type="text" value="">

					<label class="block-label" for="contents">내용</label>
					<textarea id="contents" name="contents"  value=""></textarea>
					<input type="submit" value="글쓰기">
				</form>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp" />
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>