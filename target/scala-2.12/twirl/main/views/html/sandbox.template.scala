
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
<body>
    <center>
        <article style="margin-top:50px;">
            """),_display_(/*17.14*/content),format.raw/*17.21*/("""
            """),_display_(/*18.14*/if(searchResults != null)/*18.39*/ {_display_(Seq[Any](format.raw/*18.41*/("""
            """),_display_(/*19.14*/for((searchTerms, searchResultlist) <- searchResults) yield /*19.67*/{_display_(Seq[Any](format.raw/*19.68*/("""
            """),_display_(/*20.14*/if(searchResultlist.getResult().size()>0)/*20.55*/{_display_(Seq[Any](format.raw/*20.56*/("""
            """),format.raw/*21.13*/("""<script src='"""),_display_(/*21.27*/routes/*21.33*/.Assets.versioned("javascripts/index.js")),format.raw/*21.74*/("""' type="text/javascript"></script>
            <p>Search terms : <span id="resultterm">"""),_display_(/*22.54*/searchTerms),format.raw/*22.65*/("""</span> : Flesh reading Ease Index: <span id="FLINDEX">"""),_display_(/*22.121*/searchResultlist/*22.137*/.getFleschIndex()),format.raw/*22.154*/("""</span>  FKGL : <span id="FKGL">"""),_display_(/*22.187*/searchResultlist/*22.203*/.getFkgl()),format.raw/*22.213*/("""</span></p>
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.wordStat(searchTerms)),format.raw/*23.66*/("""">Global Stats</a>
            <table class=""""),_display_(/*24.28*/searchTerms),format.raw/*24.39*/("""">
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
                """),_display_(/*35.18*/for(result <- searchResultlist.getResult()) yield /*35.61*/{_display_(Seq[Any](format.raw/*35.62*/("""
                """),format.raw/*36.17*/("""<tr class=""""),_display_(/*36.29*/searchTerms),_display_(/*36.41*/result/*36.47*/.getIndex()),format.raw/*36.58*/("""">
                    <td id="o_id"""),_display_(/*37.34*/searchTerms),_display_(/*37.46*/result/*37.52*/.getIndex()),format.raw/*37.63*/(""""><a href='"""),_display_(/*37.75*/routes/*37.81*/.HomeController.profile(result.getOwner_id())),format.raw/*37.126*/("""' target="_blank">"""),_display_(/*37.145*/result/*37.151*/.getOwner_id()),format.raw/*37.165*/("""</a></td>
                    <td id="date"""),_display_(/*38.34*/searchTerms),_display_(/*38.46*/result/*38.52*/.getIndex()),format.raw/*38.63*/("""">"""),_display_(/*38.66*/result/*38.72*/.getDate()),format.raw/*38.82*/("""</td>
                    <td id="title"""),_display_(/*39.35*/searchTerms),_display_(/*39.47*/result/*39.53*/.getIndex()),format.raw/*39.64*/("""">"""),_display_(/*39.67*/result/*39.73*/.getTitle()),format.raw/*39.84*/("""</td>
                    <td id="type"""),_display_(/*40.34*/searchTerms),_display_(/*40.46*/result/*40.52*/.getIndex()),format.raw/*40.63*/("""">"""),_display_(/*40.66*/result/*40.72*/.getType()),format.raw/*40.82*/("""</td>
                    <td id="skill"""),_display_(/*41.35*/searchTerms),_display_(/*41.47*/result/*41.53*/.getIndex()),format.raw/*41.64*/("""">"""),_display_(/*41.67*/for((key,value) <- result.getSkills()) yield /*41.105*/{_display_(Seq[Any](format.raw/*41.106*/("""
                        """),format.raw/*42.25*/("""<u><a href=""""),_display_(/*42.38*/routes/*42.44*/.HomeController.skill(value)),format.raw/*42.72*/("""" target="_blank">"""),_display_(/*42.91*/key),format.raw/*42.94*/("""</a></u>
                        """)))}),format.raw/*43.26*/("""
                    """),format.raw/*44.21*/("""</td>
                    <td id="indvs"""),_display_(/*45.35*/searchTerms),_display_(/*45.47*/result/*45.53*/.getIndex()),format.raw/*45.64*/(""""><a href=""""),_display_(/*45.76*/routes/*45.82*/.HomeController.indvStat(searchTerms, result.getIndex())),format.raw/*45.138*/("""" target="_blank">Stats</a></td>
                    <td id="read"""),_display_(/*46.34*/searchTerms),_display_(/*46.46*/result/*46.52*/.getIndex()),format.raw/*46.63*/(""""><a href=""""),_display_(/*46.75*/routes/*46.81*/.HomeController.readability(searchTerms, result.getIndex())),format.raw/*46.140*/("""" target="_blank">Readability</a></td>
                    <td id="edlevel"""),_display_(/*47.37*/searchTerms),_display_(/*47.49*/result/*47.55*/.getIndex()),format.raw/*47.66*/("""">"""),_display_(/*47.69*/searchResultlist/*47.85*/.getEdLevel()),format.raw/*47.98*/("""</td>
                </tr>
                """)))}),format.raw/*49.18*/("""
            """),format.raw/*50.13*/("""</table>
            """)))}/*51.14*/else/*51.18*/{_display_(Seq[Any](format.raw/*51.19*/("""
            """),format.raw/*52.13*/("""<p>Search terms : """),_display_(/*52.32*/searchTerms),format.raw/*52.43*/(""" """),format.raw/*52.44*/(""": Flesh reading Ease Index: ## FKGL: ##.##</p>
            <p>There are no project for the term : """),_display_(/*53.53*/searchTerms),format.raw/*53.64*/("""</p>
            """)))}),format.raw/*54.14*/("""
            """)))}),format.raw/*55.14*/("""
            """)))}),format.raw/*56.14*/("""
        """),format.raw/*57.9*/("""</article>
    </center>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src='"""),_display_(/*60.19*/routes/*60.25*/.Assets.versioned("javascripts/knockout-3.5.1.js")),format.raw/*60.75*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("javascripts/main.js")),format.raw/*61.65*/("""' type="text/javascript"></script>

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
                  HASH: 428c1241bd17d9c8cc92603932ecd8c186af3c49
                  MATRIX: 611->1|992->27|1189->128|1219->132|1328->215|1353->220|1438->279|1452->285|1513->326|1598->384|1613->390|1674->429|1820->548|1848->555|1890->570|1924->595|1964->597|2006->612|2075->665|2114->666|2156->681|2206->722|2245->723|2287->737|2328->751|2343->757|2405->798|2521->887|2553->898|2637->954|2663->970|2702->987|2763->1020|2789->1036|2821->1046|2883->1081|2898->1087|2956->1124|3030->1171|3062->1182|3445->1538|3504->1581|3543->1582|3589->1600|3628->1612|3660->1624|3675->1630|3707->1641|3771->1678|3803->1690|3818->1696|3850->1707|3889->1719|3904->1725|3971->1770|4018->1789|4034->1795|4070->1809|4141->1853|4173->1865|4188->1871|4220->1882|4250->1885|4265->1891|4296->1901|4364->1942|4396->1954|4411->1960|4443->1971|4473->1974|4488->1980|4520->1991|4587->2031|4619->2043|4634->2049|4666->2060|4696->2063|4711->2069|4742->2079|4810->2120|4842->2132|4857->2138|4889->2149|4919->2152|4974->2190|5014->2191|5068->2217|5108->2230|5123->2236|5172->2264|5218->2283|5242->2286|5308->2321|5358->2343|5426->2384|5458->2396|5473->2402|5505->2413|5544->2425|5559->2431|5637->2487|5731->2554|5763->2566|5778->2572|5810->2583|5849->2595|5864->2601|5945->2660|6048->2736|6080->2748|6095->2754|6127->2765|6157->2768|6182->2784|6216->2797|6294->2844|6336->2858|6378->2881|6391->2885|6430->2886|6472->2900|6518->2919|6550->2930|6579->2931|6706->3031|6738->3042|6788->3061|6834->3076|6880->3091|6917->3101|7083->3240|7098->3246|7169->3296|7250->3350|7265->3356|7326->3396
                  LINES: 23->1|28->2|33->2|35->4|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|80->49|81->50|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|84->53|85->54|86->55|87->56|88->57|91->60|91->60|91->60|92->61|92->61|92->61
                  -- GENERATED --
              */
          