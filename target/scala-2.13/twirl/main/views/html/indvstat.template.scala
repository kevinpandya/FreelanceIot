
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
/*1.2*/import model.Searchphraseresult
/*2.2*/import model.Resultlist
/*3.2*/import java.util

object indvstat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(searchResults: util.Map[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.44*/("""


"""),_display_(/*7.2*/main("FreeLancelot")/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    """),format.raw/*8.5*/("""<center>
        <article style="margin-top:50px;">
            <div>
                <p>"""),_display_(/*11.21*/searchResults),format.raw/*11.34*/("""</p>
            </div>
        </article>
    </center>
""")))}))
      }
    }
  }

  def render(searchResults:util.Map[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((util.Map[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/indvstat.scala.html
                  HASH: 8bc402ac1b4dc2a22ea1f8fd3591dfd558689967
                  MATRIX: 610->1|649->35|680->61|1023->80|1160->122|1192->129|1220->149|1259->151|1291->157|1411->250|1445->263
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|42->11|42->11
                  -- GENERATED --
              */
          