
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

object sandbox extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,play.mvc.Http.Request,Map[String, Resultlist],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, request: play.mvc.Http.Request, searchResults:Map[String, Resultlist])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.103*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""'>
    <style>
    </style>
</head>
<body data-ws-url=""""),_display_(/*14.21*/routes/*14.27*/.WebSocketController.ws.webSocketURL(request)),format.raw/*14.72*/("""">
    <center>
        <article style="margin-top:50px;">
            """),_display_(/*17.14*/content),format.raw/*17.21*/("""
            """),_display_(/*18.14*/if(searchResults != null)/*18.39*/ {_display_(Seq[Any](format.raw/*18.41*/("""
            """),_display_(/*19.14*/for((searchTerms, searchResultlist) <- searchResults) yield /*19.67*/{_display_(Seq[Any](format.raw/*19.68*/("""
            """),_display_(/*20.14*/if(searchResultlist.getResult().size()>0)/*20.55*/{_display_(Seq[Any](format.raw/*20.56*/("""
            """),format.raw/*21.13*/("""<p>Search terms : """),_display_(/*21.32*/searchTerms),format.raw/*21.43*/(""" """),format.raw/*21.44*/(""": Flesh reading Ease Index: """),_display_(/*21.73*/searchResultlist/*21.89*/.getFleschIndex()),format.raw/*21.106*/("""  """),format.raw/*21.108*/("""FKGL : """),_display_(/*21.116*/searchResultlist/*21.132*/.getFkgl()),format.raw/*21.142*/("""</p>
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.wordStat(searchTerms)),format.raw/*22.66*/("""">Global Stats</a>
            <table>
                <tr>
                    <th>Owner_id</th>
                    <th>Date</th>
                    <th>Title</th>
                    <th>Type</th>
                    <th>Skills</th>
                    <th></th>
                    <th></th>
                    <th>Education Level</th>
                </tr>
                """),_display_(/*34.18*/for(result <- searchResultlist.getResult()) yield /*34.61*/{_display_(Seq[Any](format.raw/*34.62*/("""
                """),format.raw/*35.17*/("""<tr>
                    <td><a href='"""),_display_(/*36.35*/routes/*36.41*/.HomeController.profile(result.getOwner_id())),format.raw/*36.86*/("""'>"""),_display_(/*36.89*/result/*36.95*/.getOwner_id()),format.raw/*36.109*/("""</a></td>
                    <td>"""),_display_(/*37.26*/result/*37.32*/.getDate()),format.raw/*37.42*/("""</td>
                    <td>"""),_display_(/*38.26*/result/*38.32*/.getTitle()),format.raw/*38.43*/("""</td>
                    <td>"""),_display_(/*39.26*/result/*39.32*/.getType()),format.raw/*39.42*/("""</td>
                    <td>"""),_display_(/*40.26*/for((key,value) <- result.getSkills()) yield /*40.64*/{_display_(Seq[Any](format.raw/*40.65*/("""
                        """),format.raw/*41.25*/("""<u><a href=""""),_display_(/*41.38*/routes/*41.44*/.HomeController.skill(value)),format.raw/*41.72*/("""" target="_blank">"""),_display_(/*41.91*/key),format.raw/*41.94*/("""</a></u>
                        """)))}),format.raw/*42.26*/("""
                    """),format.raw/*43.21*/("""</td>
                    <td><a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.indvStat(searchTerms, result.getIndex())),format.raw/*44.97*/("""">Stats</a></td>
                    <td><a href=""""),_display_(/*45.35*/routes/*45.41*/.HomeController.readability(searchTerms, result.getIndex())),format.raw/*45.100*/("""">Readability</a></td>
                    <td>"""),_display_(/*46.26*/searchResultlist/*46.42*/.getEdLevel()),format.raw/*46.55*/("""</td>
                </tr>
                """)))}),format.raw/*48.18*/("""
            """),format.raw/*49.13*/("""</table>
            """)))}/*50.14*/else/*50.18*/{_display_(Seq[Any](format.raw/*50.19*/("""
            """),format.raw/*51.13*/("""<p>Search terms : """),_display_(/*51.32*/searchTerms),format.raw/*51.43*/(""" """),format.raw/*51.44*/(""": Flesh reading Ease Index: ## FKGL: ##.##</p>
            <p>There are no project for the term : """),_display_(/*52.53*/searchTerms),format.raw/*52.64*/("""</p>
            """)))}),format.raw/*53.14*/("""
            """)))}),format.raw/*54.14*/("""
            """)))}),format.raw/*55.14*/("""
        """),format.raw/*56.9*/("""</article>
    </center>
    <script src='"""),_display_(/*58.19*/routes/*58.25*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*58.71*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*59.19*/routes/*59.25*/.Assets.versioned("javascripts/knockout-3.5.1.js")),format.raw/*59.75*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*60.19*/routes/*60.25*/.Assets.versioned("javascripts/main.js")),format.raw/*60.65*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("javascripts/index.js")),format.raw/*61.66*/("""' type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,request:play.mvc.Http.Request,searchResults:Map[String, Resultlist],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,request,searchResults)(content)

  def f:((String,play.mvc.Http.Request,Map[String, Resultlist]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,request,searchResults) => (content) => apply(title,request,searchResults)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/sandbox.scala.html
                  HASH: dded83c7729f08a6abff1d60687c0ba165e23bee
                  MATRIX: 611->1|992->27|1189->128|1219->132|1328->215|1353->220|1438->279|1452->285|1513->326|1598->384|1613->390|1674->429|1761->489|1776->495|1842->540|1944->615|1972->622|2014->637|2048->662|2088->664|2130->679|2199->732|2238->733|2280->748|2330->789|2369->790|2411->804|2457->823|2489->834|2518->835|2574->864|2599->880|2638->897|2669->899|2705->907|2731->923|2763->933|2818->961|2833->967|2891->1004|3311->1397|3370->1440|3409->1441|3455->1459|3522->1499|3537->1505|3603->1550|3633->1553|3648->1559|3684->1573|3747->1609|3762->1615|3793->1625|3852->1657|3867->1663|3899->1674|3958->1706|3973->1712|4004->1722|4063->1754|4117->1792|4156->1793|4210->1819|4250->1832|4265->1838|4314->1866|4360->1885|4384->1888|4450->1923|4500->1945|4568->1986|4583->1992|4660->2048|4739->2100|4754->2106|4835->2165|4911->2214|4936->2230|4970->2243|5048->2290|5090->2304|5132->2327|5145->2331|5184->2332|5226->2346|5272->2365|5304->2376|5333->2377|5460->2477|5492->2488|5542->2507|5588->2522|5634->2537|5671->2547|5743->2592|5758->2598|5825->2644|5906->2698|5921->2704|5992->2754|6073->2808|6088->2814|6149->2854|6230->2908|6245->2914|6307->2955
                  LINES: 23->1|28->2|33->2|35->4|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|45->14|45->14|45->14|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|65->34|65->34|65->34|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|80->49|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|84->53|85->54|86->55|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61
                  -- GENERATED --
              */
          