<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="InsertEventServlet" method="post">
Title<input type="text" name="email"><br>
Type
           <input type="radio" class="radio" name="type" value="physical" id="physical" />
           <label for="y">Physical</label>
           <input type="radio" class="radio" name="type" value="virtual" id="virtual" />
           <label for="z">Virtual</label><br>
 Location <input type=text name="location"><br>
 Date <input type=text name="date"><br>
 Starting Time <input type=text name="stime"><br>
 Ending Time <input type=text name="etime"><br>
 Event Package
 			<input type="radio" class="radio" name="pid" value="premium" id="premium" />
           <label for="y">premium</label>
           <input type="radio" class="radio" name="pid" value="platinum" id="platinum" />
           <label for="z">platinum</label>
           <input type="radio" class="radio" name="pid" value="gold" id="gold" />
           <label for="y">gold</label>
           <input type="radio" class="radio" name="pid" value="silver" id="silver" />
           <label for="y">silver</label>
           <input type="radio" class="radio" name="pid" value="bronz" id="bronz" />
           <label for="z">bronze</label><br>
<button type="submit" class="btn btn-primary">Save</button>
<button type="reset" class="btn btn-secondary" data-dismiss="modal"> Clear</button>
</form>
</body>
</html>