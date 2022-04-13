
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.collection.JavaConverters._
/*1.2*/import model.Resultlist

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.mvc.Http.Request,Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(request: play.mvc.Http.Request, searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.74*/("""

"""),_display_(/*4.2*/sandbox("FreeLancelot",request,searchResults)/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""
	"""),format.raw/*5.2*/("""<h1>Welcome to FreeLancelot</h1>
	<form id="searchForm" action="/" method="GET">
		<input type="text" id="query" name="searchPhrase" placeholder="Enter search terms"/>
		<input id="submitbtn" type="submit" value="Go!" />
		<br />
		<input type="text" id="hiddenId" name="sessionId" value="" />
	</form>
	<div id="repos">

	</div>
""")))}))
      }
    }
  }

  def render(request:play.mvc.Http.Request,searchResults:Map[String, Resultlist]): play.twirl.api.HtmlFormat.Appendable = apply(request,searchResults)

  def f:((play.mvc.Http.Request,Map[String, Resultlist]) => play.twirl.api.HtmlFormat.Appendable) = (request,searchResults) => apply(request,searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: c20283c4b86326cc70c6d699055e90c198619f9c
                  MATRIX: 611->1|978->27|1145->99|1175->104|1228->149|1267->151|1296->154
                  LINES: 23->1|28->2|33->2|35->4|35->4|35->4|36->5
                  -- GENERATED --
              */
          