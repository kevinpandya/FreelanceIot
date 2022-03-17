
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

object stat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(searchResults: util.Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.47*/("""


    """),_display_(/*7.6*/main("FreeLancelot")/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
        """),format.raw/*8.9*/("""<center>
            <article style="margin-top:50px;">
                <div>
                """),_display_(/*11.18*/if(searchResults != null)/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""
                    """),_display_(/*12.22*/for((searchTerms, searchResultlist) <- searchResults) yield /*12.75*/{_display_(Seq[Any](format.raw/*12.76*/("""
                        """),format.raw/*13.25*/("""<p>Search terms : """),_display_(/*13.44*/searchTerms),format.raw/*13.55*/(""" """),format.raw/*13.56*/(""": Flesh reading Ease Index ## FKGL #.#</p>

                        <table style="width: 30%; border: black 1px solid">
                        """),_display_(/*16.26*/for(result <- searchResultlist.getResult()) yield /*16.69*/ {_display_(Seq[Any](format.raw/*16.71*/("""
                            """),_display_(/*17.30*/for((key, value) <- result.getWordStats()) yield /*17.72*/ {_display_(Seq[Any](format.raw/*17.74*/("""
                                """),format.raw/*18.33*/("""<tr>
                                    <td>"""),_display_(/*19.42*/key),format.raw/*19.45*/("""</td>
                                    <td>"""),_display_(/*20.42*/value),format.raw/*20.47*/("""</td>
                                </tr>
                            """)))}),format.raw/*22.30*/("""
                        """)))}),format.raw/*23.26*/("""
                        """),format.raw/*24.25*/("""</table>
                    """)))}),format.raw/*25.22*/("""
                """)))}),format.raw/*26.18*/("""
                """),format.raw/*27.17*/("""</div>
            </article>
        </center>
    """)))}))
      }
    }
  }

  def render(searchResults:util.Map[String, Resultlist]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((util.Map[String, Resultlist]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/stat.scala.html
                  HASH: ec3b3874ceabcf711a4c7676c5d1f82a57625139
                  MATRIX: 610->1|649->35|680->61|1022->80|1162->125|1198->136|1226->156|1265->158|1301->168|1426->266|1460->291|1500->293|1550->316|1619->369|1658->370|1712->396|1758->415|1790->426|1819->427|1994->575|2053->618|2093->620|2151->651|2209->693|2249->695|2311->729|2385->776|2409->779|2484->827|2510->832|2616->907|2674->934|2728->960|2790->991|2840->1010|2886->1028
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|50->19|51->20|51->20|53->22|54->23|55->24|56->25|57->26|58->27
                  -- GENERATED --
              */
          