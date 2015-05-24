class UrlMappings {

	static mappings = {

        "/" {
            controller = "search"
            action = "renderSearch"
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index")
        "500"(view:'/error')
	}
}
