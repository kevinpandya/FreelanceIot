
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

object OriginalSkill extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.42*/("""


"""),_display_(/*6.2*/main("FreeLancelot")/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
"""),format.raw/*7.1*/("""<center>
    <article style="margin-top:50px;">
        <div>
            """),_display_(/*10.14*/if(searchResults != null)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),_display_(/*11.14*/for((searchTerms, searchResultlist) <- searchResults) yield /*11.67*/{_display_(Seq[Any](format.raw/*11.68*/("""
            """),format.raw/*12.13*/("""<h1>Skill : """),_display_(/*12.26*/searchTerms),format.raw/*12.37*/(""" """),format.raw/*12.38*/("""</h1>
            <table>
                <tr>
                    <th>Owner_id</th>
                    <th>Date</th>
                    <th>Title</th>
                    <th>Type</th>
                    <th>Skills</th>
                </tr>
                """),_display_(/*21.18*/for(result <- searchResultlist.getResult()) yield /*21.61*/{_display_(Seq[Any](format.raw/*21.62*/("""
                """),format.raw/*22.17*/("""<tr>
                    <td><a href='"""),_display_(/*23.35*/routes/*23.41*/.HomeController.profile(result.getOwner_id())),format.raw/*23.86*/("""'>"""),_display_(/*23.89*/result/*23.95*/.getOwner_id()),format.raw/*23.109*/("""</a></td>
                    <td>"""),_display_(/*24.26*/result/*24.32*/.getDate()),format.raw/*24.42*/("""</td>
                    <td>"""),_display_(/*25.26*/result/*25.32*/.getTitle()),format.raw/*25.43*/("""</td>
                    <td>"""),_display_(/*26.26*/result/*26.32*/.getType()),format.raw/*26.42*/("""</td>
                    <td>"""),_display_(/*27.26*/for((key,value) <- result.getSkills()) yield /*27.64*/{_display_(Seq[Any](format.raw/*27.65*/("""
                        """),format.raw/*28.25*/("""<u><a href=""""),_display_(/*28.38*/routes/*28.44*/.HomeController.skill(value)),format.raw/*28.72*/("""">"""),_display_(/*28.75*/key),format.raw/*28.78*/("""</a></u>
                        """)))}),format.raw/*29.26*/("""
                    """),format.raw/*30.21*/("""</td>
                </tr>
                """)))}),format.raw/*32.18*/("""
            """),format.raw/*33.13*/("""</table>
            """)))}),format.raw/*34.14*/("""
            """)))}),format.raw/*35.14*/("""
        """),format.raw/*36.9*/("""</div>
    </article>
</center>
""")))}))
      }
    }
  }

  def render(searchResults:Map[String, Resultlist]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((Map[String, Resultlist]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/OriginalSkill.scala.html
                  HASH: d83ec900c2ac5eaba1128fa319b51d8d93c803de
                  MATRIX: 610->1|649->35|1002->61|1137->101|1169->108|1197->128|1236->130|1264->132|1369->210|1403->235|1443->237|1485->252|1554->305|1593->306|1635->320|1675->333|1707->344|1736->345|2035->617|2094->660|2133->661|2179->679|2246->719|2261->725|2327->770|2357->773|2372->779|2408->793|2471->829|2486->835|2517->845|2576->877|2591->883|2623->894|2682->926|2697->932|2728->942|2787->974|2841->1012|2880->1013|2934->1039|2974->1052|2989->1058|3038->1086|3068->1089|3092->1092|3158->1127|3208->1149|3286->1196|3328->1210|3382->1233|3428->1248|3465->1258
                  LINES: 23->1|24->2|29->3|34->3|37->6|37->6|37->6|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|52->21|52->21|52->21|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|63->32|64->33|65->34|66->35|67->36
                  -- GENERATED --
              */
          