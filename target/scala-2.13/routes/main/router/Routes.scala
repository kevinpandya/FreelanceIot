// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:12
  WebSocketController_0: controllers.WebSocketController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:12
    WebSocketController_0: controllers.WebSocketController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, WebSocketController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, WebSocketController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(request:Request, searchPhrase:String ?= "", sessionId:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skill/""" + "$" + """id<[^/]+>""", """controllers.HomeController.skill(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stat/""" + "$" + """search<[^/]+>""", """controllers.HomeController.wordStat(search:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """indvstats/""" + "$" + """search<[^/]+>/""" + "$" + """index<[^/]+>""", """controllers.HomeController.indvStat(search:String, index:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """ownerid<[^/]+>""", """controllers.HomeController.profile(ownerid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """readability/""" + "$" + """search<[^/]+>/""" + "$" + """index<[^/]+>""", """controllers.HomeController.readability(search:String, index:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """h/ws""", """controllers.WebSocketController.ws"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_2.index(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_skill1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skill/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_skill1_invoker = createInvoker(
    HomeController_2.skill(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "skill",
      Seq(classOf[String]),
      "GET",
      this.prefix + """skill/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_wordStat2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stat/"), DynamicPart("search", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_wordStat2_invoker = createInvoker(
    HomeController_2.wordStat(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "wordStat",
      Seq(classOf[String]),
      "GET",
      this.prefix + """stat/""" + "$" + """search<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_indvStat3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("indvstats/"), DynamicPart("search", """[^/]+""",true), StaticPart("/"), DynamicPart("index", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_indvStat3_invoker = createInvoker(
    HomeController_2.indvStat(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "indvStat",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """indvstats/""" + "$" + """search<[^/]+>/""" + "$" + """index<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("ownerid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_profile4_invoker = createInvoker(
    HomeController_2.profile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """profile/""" + "$" + """ownerid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_readability5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("readability/"), DynamicPart("search", """[^/]+""",true), StaticPart("/"), DynamicPart("index", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_readability5_invoker = createInvoker(
    HomeController_2.readability(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "readability",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """readability/""" + "$" + """search<[^/]+>/""" + "$" + """index<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_WebSocketController_ws6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("h/ws")))
  )
  private[this] lazy val controllers_WebSocketController_ws6_invoker = createInvoker(
    WebSocketController_0.ws,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebSocketController",
      "ws",
      Nil,
      "GET",
      this.prefix + """h/ws""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[String]("searchPhrase", Some("")), params.fromQuery[String]("sessionId", Some(""))) { (searchPhrase, sessionId) =>
        controllers_HomeController_index0_invoker.call(
          req => HomeController_2.index(req, searchPhrase, sessionId))
      }
  
    // @LINE:7
    case controllers_HomeController_skill1_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_skill1_invoker.call(HomeController_2.skill(id))
      }
  
    // @LINE:8
    case controllers_HomeController_wordStat2_route(params@_) =>
      call(params.fromPath[String]("search", None)) { (search) =>
        controllers_HomeController_wordStat2_invoker.call(HomeController_2.wordStat(search))
      }
  
    // @LINE:9
    case controllers_HomeController_indvStat3_route(params@_) =>
      call(params.fromPath[String]("search", None), params.fromPath[Integer]("index", None)) { (search, index) =>
        controllers_HomeController_indvStat3_invoker.call(HomeController_2.indvStat(search, index))
      }
  
    // @LINE:10
    case controllers_HomeController_profile4_route(params@_) =>
      call(params.fromPath[String]("ownerid", None)) { (ownerid) =>
        controllers_HomeController_profile4_invoker.call(HomeController_2.profile(ownerid))
      }
  
    // @LINE:11
    case controllers_HomeController_readability5_route(params@_) =>
      call(params.fromPath[String]("search", None), params.fromPath[Integer]("index", None)) { (search, index) =>
        controllers_HomeController_readability5_invoker.call(HomeController_2.readability(search, index))
      }
  
    // @LINE:12
    case controllers_WebSocketController_ws6_route(params@_) =>
      call { 
        controllers_WebSocketController_ws6_invoker.call(WebSocketController_0.ws)
      }
  
    // @LINE:15
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
