
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
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("FreeLancelot")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""<center>
	<article style="margin-top:50px;">
	<h1>Welcome to FreeLancelot</h1>
	<form action="/" method="GET">
		<input type="text" name="searchPhrase" placeholder="Enter serach terms"/>
		<input type="submit" name="search" value="Go!" />
	</form>
	</article>
</center>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: b586999cfc26fa05337ed4dcbc461e3d2551ddaa
                  MATRIX: 989->3|1017->23|1056->25|1083->26
                  LINES: 32->3|32->3|32->3|33->4
                  -- GENERATED --
              */
          