<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="taskManagerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AngularJS Task Manager</title>
<link href='${pageContext.request.contextPath}/resources/web/css/style.css' rel="stylesheet" type="text/css"></link>
<link href='${pageContext.request.contextPath}/resources/web/css/css/font-awesome.css' rel="stylesheet" type="text/css"></link>
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<script data-require="angular.js@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular.js"></script>
  <script data-require="angular-animate@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular-animate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/web/js/app.js"></script>
</head>
<body>
<div ng-controller="taskManagerController">
 <div id="task-panel" class="fadein fadeout showpanel panel"  ng-show="toggle"> 
  <div class="panel-heading">
   <i class="panel-title-icon fa fa-tasks"></i>
   <span class="panel-title">Recent Law</span>
   <div class="panel-heading-controls">
    <button ng-click="toggle = !toggle" >Add New Law</button>
    <button confirmed-click="deleteLaw()" ng-confirm-click="Would you like to delete completed law?">Delete  law</button>
   </div>
  </div>
  <div>
   <div ng-repeat="law in Laws">

    <div>
     <input id="{{law.id}}" type="checkbox" value="{{law.id}}" ng-checked="selection.indexOf(law.id) > -1" ng-click="toggleSelection(law.id)" />
       <label for="{{task.taskId}}"></label>  
    </div>
    <div ng-if="task.taskStatus=='COMPLETED'">    
     <a href="#" class="checkedClass">
      {{task.name}}
     <span class="action-status">{{law.status}}</span>
     </a>
    </div>
    <div ng-if="task.taskStatus=='ACTIVE'">    
     <a href="#" class="uncheckedClass">
      {{task.name}}
      <span class="action-status">{{law.status}}</span>
     </a>
    </div>
   </div>
  </div>
 </div>
 <div id="add-task-panel" ng-hide="toggle">
  <div>
   <span>Add Task</span>
   <div>
    <button ng-click="toggle = !toggle">Show All Tasks</button>
   </div>
  </div>
  <div>
   <div>
    <table>
     <tr>
      <td>Law Id:</td>
      <td><input type="text" ng-model="id"/></td>
     </tr>
     <tr>
     
      <tr>
      <td>Law Name:</td>
      <td><input type="text" ng-model="name"/></td>
     </tr>
     <tr>
     
     
      <tr>
      <td> Summary:</td>
      <td><input type="text" ng-model="summary"/></td>
     </tr>
     <tr>
     
     
      <tr>
      <td>ResourceLink:</td>
      <td><input type="text" ng-model="resourceLink"/></td>
     </tr>

     <tr>
      <td>Status:</td>
      <td>
       <select ng-model="status" ng-options="status as status for status in statuses">
        <option value="">-- Select --</option>      
            </select>
      </td>
     </tr>
  
     <tr>
      <td>
<button ng-click="addLaw()" class="btn-panel-big">Add New Task</button></td>
     </tr>
    </table>        
   </div>
  </div>
 </div>
</div>
</body>
</html>