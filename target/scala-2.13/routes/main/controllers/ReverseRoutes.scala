// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def time: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "time")
    }
  
    // @LINE:8
    def tutorial: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:12
    def plus(a1:String, a2:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "plus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("a1", a1)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("a2", a2)))
    }
  
    // @LINE:10
    def hello(message:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("message", message)))
    }
  
    // @LINE:11
    def helloPlay(message:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "helloplay/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("message", message)))
    }
  
    // @LINE:7
    def explore: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:6
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def apiCall: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "apicall")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
