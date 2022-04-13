
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
                  HASH: c1149dcf17ba303c84a4a1001c7ea03c4f3f5ee0
                  MATRIX: 611->1|650->35|1003->61|1138->101|1170->108|1198->128|1237->130|1265->132|1370->210|1404->235|1444->237|1486->252|1555->305|1594->306|1636->320|1676->333|1708->344|1737->345|2036->617|2095->660|2134->661|2180->679|2247->719|2262->725|2328->770|2358->773|2373->779|2409->793|2472->829|2487->835|2518->845|2577->877|2592->883|2624->894|2683->926|2698->932|2729->942|2788->974|2842->1012|2881->1013|2935->1039|2975->1052|2990->1058|3039->1086|3069->1089|3093->1092|3159->1127|3209->1149|3287->1196|3329->1210|3383->1233|3429->1248|3466->1258
                  LINES: 23->1|24->2|29->3|34->3|37->6|37->6|37->6|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|52->21|52->21|52->21|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|63->32|64->33|65->34|66->35|67->36
                  -- GENERATED --
              */
          