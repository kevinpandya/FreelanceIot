
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("FreeLancelot")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<center>
	<article style="margin-top:50px;">
	<h1>Welcome to FreeLancelot</h1>
	<form action="/" method="GET">
<<<<<<< HEAD
		<input type="text" name="searchPhrase" placeholder="Enter serach terms"/>
		<input type="submit" value="Go!" />
=======
		<input type="text" name="searchPhrase" placeholder="Enter search terms"/>
		<input type="submit" name="search" value="Go!" />
>>>>>>> f3ca293d357bddd15cd89a5bfc2631d652d4d7ff
	</form>
	<div>
		"""),_display_(/*14.4*/if(searchResults != null)/*14.29*/ {_display_(Seq[Any](format.raw/*14.31*/("""
			"""),_display_(/*15.5*/for((searchTerms, searchResultlist) <- searchResults) yield /*15.58*/{_display_(Seq[Any](format.raw/*15.59*/("""
				"""),format.raw/*16.5*/("""<p>Search terms : """),_display_(/*16.24*/searchTerms),format.raw/*16.35*/(""" """),format.raw/*16.36*/(""": Flesh reading Ease Index ## FKGL #.#</p>
<<<<<<< HEAD
				<p><a href=#>Global Stats</a></p>
=======
				<a href=""""),_display_(/*17.15*/routes/*17.21*/.HomeController.wordStat(searchTerms)),format.raw/*17.58*/("""">Global Stats</a>
>>>>>>> f3ca293d357bddd15cd89a5bfc2631d652d4d7ff
				<table>
				<tr>
					<th>Owner_id</th>
					<th>Date</th>
					<th>Title</th>
					<th>Type</th>
					<th>Skills</th>
				</tr>
				"""),_display_(/*26.6*/for(result <- searchResultlist.getResult()) yield /*26.49*/{_display_(Seq[Any](format.raw/*26.50*/("""
					"""),format.raw/*27.6*/("""<tr>
						<td><a href=#>"""),_display_(/*28.22*/result/*28.28*/.getOwner_id()),format.raw/*28.42*/("""</a></td>
						<td>"""),_display_(/*29.12*/result/*29.18*/.getDate()),format.raw/*29.28*/("""</td>
						<td>"""),_display_(/*30.12*/result/*30.18*/.getTitle()),format.raw/*30.29*/("""</td>
						<td>"""),_display_(/*31.12*/result/*31.18*/.getType()),format.raw/*31.28*/("""</td>
<<<<<<< HEAD
						<td>
							"""),_display_(/*33.9*/for((key,value) <- result.getSkills()) yield /*33.47*/{_display_(Seq[Any](format.raw/*33.48*/("""
								"""),format.raw/*34.9*/("""<u><a href=""""),_display_(/*34.22*/routes/*34.28*/.HomeController.skill(value,key)),format.raw/*34.60*/("""" target="_blank">"""),_display_(/*34.79*/key),format.raw/*34.82*/("""</a></u>
							""")))}),format.raw/*35.9*/("""
						"""),format.raw/*36.7*/("""</td>
						<td><a href=#>Stats</a></td>
						<td><a href=#>Readability</a></td>
					</tr>
				""")))}),format.raw/*40.6*/("""
				"""),format.raw/*41.5*/("""</table>
			""")))}),format.raw/*42.5*/("""
		""")))}),format.raw/*43.4*/("""
	"""),format.raw/*44.2*/("""</div>
=======
						<td>"""),_display_(/*32.12*/for((key,value) <- result.getSkills()) yield /*32.50*/{_display_(Seq[Any](format.raw/*32.51*/("""
								"""),format.raw/*33.9*/("""<u><a href=""""),_display_(/*33.22*/routes/*33.28*/.HomeController.skill(value,key)),format.raw/*33.60*/("""">"""),_display_(/*33.63*/key),format.raw/*33.66*/("""</a></u>
							""")))}),format.raw/*34.9*/("""
						"""),format.raw/*35.7*/("""</td>
						<td><a href=""""),_display_(/*36.21*/routes/*36.27*/.HomeController.indvStat(result.getPrevDesc())),format.raw/*36.73*/("""">Stats</a></td>
						<td><a href=#>Readability</a></td>
					</tr>
				""")))}),format.raw/*39.6*/("""
				"""),format.raw/*40.5*/("""</table>
			""")))}),format.raw/*41.5*/("""
		""")))}),format.raw/*42.4*/("""
	"""),format.raw/*43.2*/("""</div>
>>>>>>> f3ca293d357bddd15cd89a5bfc2631d652d4d7ff
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
                  SOURCE: app/views/index.scala.html
<<<<<<< HEAD
                  HASH: 2cebb39b2ba1ba14a1baef8d91ea959517ce814b
                  MATRIX: 610->1|649->34|994->59|1128->100|1155->102|1183->122|1222->124|1249->125|1519->369|1553->394|1593->396|1624->401|1693->454|1732->455|1764->460|1810->479|1842->490|1871->491|2116->710|2175->753|2214->754|2247->760|2300->786|2315->792|2350->806|2398->827|2413->833|2444->843|2488->860|2503->866|2535->877|2579->894|2594->900|2625->910|2676->935|2730->973|2769->974|2805->983|2845->996|2860->1002|2913->1034|2959->1053|2983->1056|3030->1073|3064->1080|3192->1178|3224->1183|3267->1196|3301->1200|3330->1202
                  LINES: 23->1|24->2|29->3|34->4|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|46->16|56->26|56->26|56->26|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|63->33|63->33|63->33|64->34|64->34|64->34|64->34|64->34|64->34|65->35|66->36|70->40|71->41|72->42|73->43|74->44
=======
                  HASH: c8feff21ea20c9b7464750b707812ff3b78e3e39
                  MATRIX: 610->1|649->34|994->59|1128->100|1155->102|1183->122|1222->124|1249->125|1533->383|1567->408|1607->410|1638->415|1707->468|1746->469|1778->474|1824->493|1856->504|1885->505|1969->562|1984->568|2042->605|2225->762|2284->805|2323->806|2356->812|2409->838|2424->844|2459->858|2507->879|2522->885|2553->895|2597->912|2612->918|2644->929|2688->946|2703->952|2734->962|2778->979|2832->1017|2871->1018|2907->1027|2947->1040|2962->1046|3015->1078|3045->1081|3069->1084|3116->1101|3150->1108|3203->1134|3218->1140|3285->1186|3389->1260|3421->1265|3464->1278|3498->1282|3527->1284
                  LINES: 23->1|24->2|29->3|34->4|35->5|35->5|35->5|36->6|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|46->16|47->17|47->17|47->17|56->26|56->26|56->26|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|63->33|63->33|63->33|64->34|65->35|66->36|66->36|66->36|69->39|70->40|71->41|72->42|73->43
>>>>>>> f3ca293d357bddd15cd89a5bfc2631d652d4d7ff
                  -- GENERATED --
              */
          