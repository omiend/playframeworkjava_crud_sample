// @SOURCE:/Users/omi-swordfish/work/play/crud_java/conf/routes
// @HASH:06d384e2fdd69e713e4b6a2f71c27233edbea03f
// @DATE:Sun Feb 23 10:42:49 JST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_createParent1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createParent"))))
        

// @LINE:9
private[this] lazy val controllers_Application_insertParent2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("insertParent"))))
        

// @LINE:10
private[this] lazy val controllers_Application_editParent3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editParent"))))
        

// @LINE:11
private[this] lazy val controllers_Application_updateParent4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateParent"))))
        

// @LINE:12
private[this] lazy val controllers_Application_deleteParent5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteParent"))))
        

// @LINE:14
private[this] lazy val controllers_Application_createChild6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createChild"))))
        

// @LINE:15
private[this] lazy val controllers_Application_insertChild7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("insertChild"))))
        

// @LINE:16
private[this] lazy val controllers_Application_editChild8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editChild"))))
        

// @LINE:17
private[this] lazy val controllers_Application_updateChild9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateChild"))))
        

// @LINE:18
private[this] lazy val controllers_Application_deleteChild10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteChild"))))
        

// @LINE:20
private[this] lazy val controllers_Application_initTestData11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("initTestData"))))
        

// @LINE:23
private[this] lazy val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index(p:Int ?= 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createParent""","""controllers.Application.createParent(p:Int ?= 1)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """insertParent""","""controllers.Application.insertParent(p:Int ?= 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editParent""","""controllers.Application.editParent(p:Int ?= 1, id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateParent""","""controllers.Application.updateParent(p:Int ?= 1, id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteParent""","""controllers.Application.deleteParent(p:Int ?= 1, id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createChild""","""controllers.Application.createChild(p:Int ?= 1, parentId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """insertChild""","""controllers.Application.insertChild(p:Int ?= 1, parentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editChild""","""controllers.Application.editChild(p:Int ?= 1, id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateChild""","""controllers.Application.updateChild(p:Int ?= 1, id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteChild""","""controllers.Application.deleteChild(p:Int ?= 1, id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """initTestData""","""controllers.Application.initTestData(p:Int ?= 1, c:Int ?= 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call(params.fromQuery[Int]("p", Some(1))) { (p) =>
        invokeHandler(controllers.Application.index(p), HandlerDef(this, "controllers.Application", "index", Seq(classOf[Int]),"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_createParent1(params) => {
   call(params.fromQuery[Int]("p", Some(1))) { (p) =>
        invokeHandler(controllers.Application.createParent(p), HandlerDef(this, "controllers.Application", "createParent", Seq(classOf[Int]),"GET", """""", Routes.prefix + """createParent"""))
   }
}
        

// @LINE:9
case controllers_Application_insertParent2(params) => {
   call(params.fromQuery[Int]("p", Some(1))) { (p) =>
        invokeHandler(controllers.Application.insertParent(p), HandlerDef(this, "controllers.Application", "insertParent", Seq(classOf[Int]),"POST", """""", Routes.prefix + """insertParent"""))
   }
}
        

// @LINE:10
case controllers_Application_editParent3(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("id", None)) { (p, id) =>
        invokeHandler(controllers.Application.editParent(p, id), HandlerDef(this, "controllers.Application", "editParent", Seq(classOf[Int], classOf[Long]),"GET", """""", Routes.prefix + """editParent"""))
   }
}
        

// @LINE:11
case controllers_Application_updateParent4(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("id", None)) { (p, id) =>
        invokeHandler(controllers.Application.updateParent(p, id), HandlerDef(this, "controllers.Application", "updateParent", Seq(classOf[Int], classOf[Long]),"POST", """""", Routes.prefix + """updateParent"""))
   }
}
        

// @LINE:12
case controllers_Application_deleteParent5(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("id", None)) { (p, id) =>
        invokeHandler(controllers.Application.deleteParent(p, id), HandlerDef(this, "controllers.Application", "deleteParent", Seq(classOf[Int], classOf[Long]),"GET", """""", Routes.prefix + """deleteParent"""))
   }
}
        

// @LINE:14
case controllers_Application_createChild6(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("parentId", None)) { (p, parentId) =>
        invokeHandler(controllers.Application.createChild(p, parentId), HandlerDef(this, "controllers.Application", "createChild", Seq(classOf[Int], classOf[Long]),"GET", """""", Routes.prefix + """createChild"""))
   }
}
        

// @LINE:15
case controllers_Application_insertChild7(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("parentId", None)) { (p, parentId) =>
        invokeHandler(controllers.Application.insertChild(p, parentId), HandlerDef(this, "controllers.Application", "insertChild", Seq(classOf[Int], classOf[Long]),"POST", """""", Routes.prefix + """insertChild"""))
   }
}
        

// @LINE:16
case controllers_Application_editChild8(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("id", None)) { (p, id) =>
        invokeHandler(controllers.Application.editChild(p, id), HandlerDef(this, "controllers.Application", "editChild", Seq(classOf[Int], classOf[Long]),"GET", """""", Routes.prefix + """editChild"""))
   }
}
        

// @LINE:17
case controllers_Application_updateChild9(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("id", None)) { (p, id) =>
        invokeHandler(controllers.Application.updateChild(p, id), HandlerDef(this, "controllers.Application", "updateChild", Seq(classOf[Int], classOf[Long]),"POST", """""", Routes.prefix + """updateChild"""))
   }
}
        

// @LINE:18
case controllers_Application_deleteChild10(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Long]("id", None)) { (p, id) =>
        invokeHandler(controllers.Application.deleteChild(p, id), HandlerDef(this, "controllers.Application", "deleteChild", Seq(classOf[Int], classOf[Long]),"GET", """""", Routes.prefix + """deleteChild"""))
   }
}
        

// @LINE:20
case controllers_Application_initTestData11(params) => {
   call(params.fromQuery[Int]("p", Some(1)), params.fromQuery[Int]("c", Some(1))) { (p, c) =>
        invokeHandler(controllers.Application.initTestData(p, c), HandlerDef(this, "controllers.Application", "initTestData", Seq(classOf[Int], classOf[Int]),"GET", """""", Routes.prefix + """initTestData"""))
   }
}
        

// @LINE:23
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     