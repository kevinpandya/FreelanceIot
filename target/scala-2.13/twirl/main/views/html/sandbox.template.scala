
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
/*1.2*/import model.Resultlist

object sandbox extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,play.mvc.Http.Request,Map[String, Resultlist],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, request: play.mvc.Http.Request ,searchResults:Map[String, Resultlist])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
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
            """),format.raw/*18.13*/("""<!--
            """),_display_(/*19.14*/if(searchResults != null)/*19.39*/ {_display_(Seq[Any](format.raw/*19.41*/("""
            """),_display_(/*20.14*/for((searchTerms, searchResultlist) <- searchResults) yield /*20.67*/{_display_(Seq[Any](format.raw/*20.68*/("""

            """),_display_(/*22.14*/if(searchResultlist.getResult().size()>0)/*22.55*/{_display_(Seq[Any](format.raw/*22.56*/("""
            """),format.raw/*23.13*/("""<p>Search terms : """),_display_(/*23.32*/searchTerms),format.raw/*23.43*/(""" """),format.raw/*23.44*/(""": Flesh reading Ease Index: """),_display_(/*23.73*/searchResultlist/*23.89*/.getFleschIndex()),format.raw/*23.106*/("""  """),format.raw/*23.108*/("""FKGL : """),_display_(/*23.116*/searchResultlist/*23.132*/.getFkgl()),format.raw/*23.142*/("""</p>
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.HomeController.wordStat(searchTerms)),format.raw/*24.66*/("""">Global Stats</a>
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
                """),_display_(/*36.18*/for(result <- searchResultlist.getResult()) yield /*36.61*/{_display_(Seq[Any](format.raw/*36.62*/("""
                """),format.raw/*37.17*/("""<tr>
                    <td><a href='"""),_display_(/*38.35*/routes/*38.41*/.HomeController.profile(result.getOwner_id())),format.raw/*38.86*/("""'>"""),_display_(/*38.89*/result/*38.95*/.getOwner_id()),format.raw/*38.109*/("""</a></td>
                    <td>"""),_display_(/*39.26*/result/*39.32*/.getDate()),format.raw/*39.42*/("""</td>
                    <td>"""),_display_(/*40.26*/result/*40.32*/.getTitle()),format.raw/*40.43*/("""</td>
                    <td>"""),_display_(/*41.26*/result/*41.32*/.getType()),format.raw/*41.42*/("""</td>
                    <td>"""),_display_(/*42.26*/for((key,value) <- result.getSkills()) yield /*42.64*/{_display_(Seq[Any](format.raw/*42.65*/("""
                        """),format.raw/*43.25*/("""<u><a href=""""),_display_(/*43.38*/routes/*43.44*/.HomeController.skill(value)),format.raw/*43.72*/("""" target="_blank">"""),_display_(/*43.91*/key),format.raw/*43.94*/("""</a></u>
                        """)))}),format.raw/*44.26*/("""
                    """),format.raw/*45.21*/("""</td>
                    <td><a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.indvStat(searchTerms, result.getIndex())),format.raw/*46.97*/("""">Stats</a></td>
                    <td><a href=""""),_display_(/*47.35*/routes/*47.41*/.HomeController.readability(searchTerms, result.getIndex())),format.raw/*47.100*/("""">Readability</a></td>
                    <td>"""),_display_(/*48.26*/searchResultlist/*48.42*/.getEdLevel()),format.raw/*48.55*/("""</td>
                </tr>
                """)))}),format.raw/*50.18*/("""
            """),format.raw/*51.13*/("""</table>
            """)))}/*52.14*/else/*52.18*/{_display_(Seq[Any](format.raw/*52.19*/("""
            """),format.raw/*53.13*/("""<p>Search terms : """),_display_(/*53.32*/searchTerms),format.raw/*53.43*/(""" """),format.raw/*53.44*/(""": Flesh reading Ease Index: ## FKGL: ##.##</p>
            <p>There are no project for the term : """),_display_(/*54.53*/searchTerms),format.raw/*54.64*/("""</p>
            """)))}),format.raw/*55.14*/("""
            """)))}),format.raw/*56.14*/("""
            """)))}),format.raw/*57.14*/("""
            """),format.raw/*58.13*/("""-->
        </article>
    </center>
    <script src='"""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*61.71*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("javascripts/knockout-3.5.1.js")),format.raw/*62.75*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("javascripts/main.js")),format.raw/*63.65*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*64.19*/routes/*64.25*/.Assets.versioned("javascripts/index.js")),format.raw/*64.66*/("""' type="text/javascript"></script>
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
                  HASH: 5b607771acceed7504ec89a9968fc57b392e02ea
                  MATRIX: 610->1|991->27|1188->128|1218->132|1327->215|1352->220|1437->279|1451->285|1512->326|1597->384|1612->390|1673->429|1760->489|1775->495|1841->540|1943->615|1971->622|2013->636|2059->655|2093->680|2133->682|2175->697|2244->750|2283->751|2327->768|2377->809|2416->810|2458->824|2504->843|2536->854|2565->855|2621->884|2646->900|2685->917|2716->919|2752->927|2778->943|2810->953|2865->981|2880->987|2938->1024|3358->1417|3417->1460|3456->1461|3502->1479|3569->1519|3584->1525|3650->1570|3680->1573|3695->1579|3731->1593|3794->1629|3809->1635|3840->1645|3899->1677|3914->1683|3946->1694|4005->1726|4020->1732|4051->1742|4110->1774|4164->1812|4203->1813|4257->1839|4297->1852|4312->1858|4361->1886|4407->1905|4431->1908|4497->1943|4547->1965|4615->2006|4630->2012|4707->2068|4786->2120|4801->2126|4882->2185|4958->2234|4983->2250|5017->2263|5095->2310|5137->2324|5179->2347|5192->2351|5231->2352|5273->2366|5319->2385|5351->2396|5380->2397|5507->2497|5539->2508|5589->2527|5635->2542|5681->2557|5723->2571|5808->2629|5823->2635|5890->2681|5971->2735|5986->2741|6057->2791|6138->2845|6153->2851|6214->2891|6295->2945|6310->2951|6372->2992
                  LINES: 23->1|28->2|33->2|35->4|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|45->14|45->14|45->14|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|67->36|67->36|67->36|68->37|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|81->50|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|86->55|87->56|88->57|89->58|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64
                  -- GENERATED --
              */
          