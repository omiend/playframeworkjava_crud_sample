// @SOURCE:/Users/omi-swordfish/work/play/crud_java/conf/routes
// @HASH:06d384e2fdd69e713e4b6a2f71c27233edbea03f
// @DATE:Sun Feb 23 10:42:49 JST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:23
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(p:Int = 1): Call = {
   Call("GET", _prefix + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)))))
}
                                                

// @LINE:17
def updateChild(p:Int = 1, id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateChild" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:18
def deleteChild(p:Int = 1, id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteChild" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:8
def createParent(p:Int = 1): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createParent" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)))))
}
                                                

// @LINE:11
def updateParent(p:Int = 1, id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateParent" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:20
def initTestData(p:Int = 1, c:Int = 1): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "initTestData" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(c == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("c", c)))))
}
                                                

// @LINE:15
def insertChild(p:Int = 1, parentId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "insertChild" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("parentId", parentId)))))
}
                                                

// @LINE:16
def editChild(p:Int = 1, id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editChild" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:9
def insertParent(p:Int = 1): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "insertParent" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)))))
}
                                                

// @LINE:12
def deleteParent(p:Int = 1, id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteParent" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:10
def editParent(p:Int = 1, id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editParent" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:14
def createChild(p:Int = 1, parentId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createChild" + queryString(List(if(p == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), Some(implicitly[QueryStringBindable[Long]].unbind("parentId", parentId)))))
}
                                                
    
}
                          
}
                  


// @LINE:23
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function(p) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p))])})
      }
   """
)
                        

// @LINE:17
def updateChild : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateChild",
   """
      function(p,id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateChild" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:18
def deleteChild : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteChild",
   """
      function(p,id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteChild" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:8
def createParent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createParent",
   """
      function(p) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createParent" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p))])})
      }
   """
)
                        

// @LINE:11
def updateParent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateParent",
   """
      function(p,id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateParent" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:20
def initTestData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.initTestData",
   """
      function(p,c) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "initTestData" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (c == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("c", c))])})
      }
   """
)
                        

// @LINE:15
def insertChild : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.insertChild",
   """
      function(p,parentId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertChild" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("parentId", parentId)])})
      }
   """
)
                        

// @LINE:16
def editChild : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editChild",
   """
      function(p,id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editChild" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:9
def insertParent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.insertParent",
   """
      function(p) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertParent" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p))])})
      }
   """
)
                        

// @LINE:12
def deleteParent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteParent",
   """
      function(p,id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteParent" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:10
def editParent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editParent",
   """
      function(p,id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editParent" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:14
def createChild : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createChild",
   """
      function(p,parentId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createChild" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("parentId", parentId)])})
      }
   """
)
                        
    
}
              
}
        


// @LINE:23
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(p:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(p), HandlerDef(this, "controllers.Application", "index", Seq(classOf[Int]), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:17
def updateChild(p:Int, id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateChild(p, id), HandlerDef(this, "controllers.Application", "updateChild", Seq(classOf[Int], classOf[Long]), "POST", """""", _prefix + """updateChild""")
)
                      

// @LINE:18
def deleteChild(p:Int, id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteChild(p, id), HandlerDef(this, "controllers.Application", "deleteChild", Seq(classOf[Int], classOf[Long]), "GET", """""", _prefix + """deleteChild""")
)
                      

// @LINE:8
def createParent(p:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createParent(p), HandlerDef(this, "controllers.Application", "createParent", Seq(classOf[Int]), "GET", """""", _prefix + """createParent""")
)
                      

// @LINE:11
def updateParent(p:Int, id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateParent(p, id), HandlerDef(this, "controllers.Application", "updateParent", Seq(classOf[Int], classOf[Long]), "POST", """""", _prefix + """updateParent""")
)
                      

// @LINE:20
def initTestData(p:Int, c:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.initTestData(p, c), HandlerDef(this, "controllers.Application", "initTestData", Seq(classOf[Int], classOf[Int]), "GET", """""", _prefix + """initTestData""")
)
                      

// @LINE:15
def insertChild(p:Int, parentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.insertChild(p, parentId), HandlerDef(this, "controllers.Application", "insertChild", Seq(classOf[Int], classOf[Long]), "POST", """""", _prefix + """insertChild""")
)
                      

// @LINE:16
def editChild(p:Int, id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editChild(p, id), HandlerDef(this, "controllers.Application", "editChild", Seq(classOf[Int], classOf[Long]), "GET", """""", _prefix + """editChild""")
)
                      

// @LINE:9
def insertParent(p:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.insertParent(p), HandlerDef(this, "controllers.Application", "insertParent", Seq(classOf[Int]), "POST", """""", _prefix + """insertParent""")
)
                      

// @LINE:12
def deleteParent(p:Int, id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteParent(p, id), HandlerDef(this, "controllers.Application", "deleteParent", Seq(classOf[Int], classOf[Long]), "GET", """""", _prefix + """deleteParent""")
)
                      

// @LINE:10
def editParent(p:Int, id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editParent(p, id), HandlerDef(this, "controllers.Application", "editParent", Seq(classOf[Int], classOf[Long]), "GET", """""", _prefix + """editParent""")
)
                      

// @LINE:14
def createChild(p:Int, parentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createChild(p, parentId), HandlerDef(this, "controllers.Application", "createChild", Seq(classOf[Int], classOf[Long]), "GET", """""", _prefix + """createChild""")
)
                      
    
}
                          
}
        
    