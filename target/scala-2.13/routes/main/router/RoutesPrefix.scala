// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nacho/Desktop/receta/conf/routes
// @DATE:Tue Feb 09 00:48:03 CET 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
