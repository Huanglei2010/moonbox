package moonbox.grid.deploy.app

import moonbox.catalog.JdbcCatalog

class SparkLocalAppMaster(jdbcCatalog: JdbcCatalog) extends AppMaster(jdbcCatalog) {

	override def createDriverDesc(config: Map[String, String]): DriverDesc = new SparkLocalDriverDesc(config)

	override def configTemplate: Map[String, String] = Map()

	override def typeName: String = "sparklocal"

	override def resourceTemplate: Map[String, String] = Map()
}
