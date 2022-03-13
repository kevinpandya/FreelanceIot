
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

object skill extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.42*/("""

"""),_display_(/*5.2*/main("FreeLancelot")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<center>
	<article style="margin-top:50px;">
	<div>
		"""),_display_(/*9.4*/if(searchResults != null)/*9.29*/ {_display_(Seq[Any](format.raw/*9.31*/("""
			"""),_display_(/*10.5*/for((searchTerms, searchResultlist) <- searchResults) yield /*10.58*/{_display_(Seq[Any](format.raw/*10.59*/("""
				"""),format.raw/*11.5*/("""<h1>Skill : """),_display_(/*11.18*/searchTerms),format.raw/*11.29*/(""" """),format.raw/*11.30*/("""</h1>
				<table>
				<tr>
					<th>Owner_id</th>
					<th>Date</th>
					<th>Title</th>
					<th>Type</th>
					<th>Skills</th>
				</tr>
				"""),_display_(/*20.6*/for(result <- searchResultlist.getResult()) yield /*20.49*/{_display_(Seq[Any](format.raw/*20.50*/("""
					"""),format.raw/*21.6*/("""<tr>
						<td><a href=#>"""),_display_(/*22.22*/result/*22.28*/.getOwner_id()),format.raw/*22.42*/("""</a></td>
						<td>"""),_display_(/*23.12*/result/*23.18*/.getDate()),format.raw/*23.28*/("""</td>
						<td>"""),_display_(/*24.12*/result/*24.18*/.getTitle()),format.raw/*24.29*/("""</td>
						<td>"""),_display_(/*25.12*/result/*25.18*/.getType()),format.raw/*25.28*/("""</td>
						<td>"""),_display_(/*26.12*/for((key,value) <- result.getSkills()) yield /*26.50*/{_display_(Seq[Any](format.raw/*26.51*/("""
								"""),format.raw/*27.9*/("""<u><a href=""""),_display_(/*27.22*/routes/*27.28*/.HomeController.skill(value,key)),format.raw/*27.60*/("""">"""),_display_(/*27.63*/key),format.raw/*27.66*/("""</a></u>
							""")))}),format.raw/*28.9*/("""
						"""),format.raw/*29.7*/("""</td>
						<td><a href=""""),_display_(/*30.21*/routes/*30.27*/.HomeController.indvStat(result.getPrevDesc())),format.raw/*30.73*/("""">Stats</a></td>
						<td><a href=#>Readability</a></td>
					</tr>
				""")))}),format.raw/*33.6*/("""
				"""),format.raw/*34.5*/("""</table>
			""")))}),format.raw/*35.5*/("""
		""")))}),format.raw/*36.4*/("""
	"""),format.raw/*37.2*/("""</div>
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
                  SOURCE: app/views/skill.scala.html
                  HASH: 5231b763bba03b1ce2f7d3f2f62a31b031b5ca71
                  MATRIX: 610->1|649->35|994->61|1129->101|1159->106|1187->126|1226->128|1254->130|1337->188|1370->213|1409->215|1441->221|1510->274|1549->275|1582->281|1622->294|1654->305|1683->306|1862->459|1921->502|1960->503|1994->510|2048->537|2063->543|2098->557|2147->579|2162->585|2193->595|2238->613|2253->619|2285->630|2330->648|2345->654|2376->664|2421->682|2475->720|2514->721|2551->731|2591->744|2606->750|2659->782|2689->785|2713->788|2761->806|2796->814|2850->841|2865->847|2932->893|3039->970|3072->976|3116->990|3151->995|3181->998
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|64->33|65->34|66->35|67->36|68->37
                  -- GENERATED --
              */
          