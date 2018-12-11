request.categories  = datastore.execute {
    select all from categories
    sort asc by name
}

request.categoriesCount = request.categories.collectEntries { category ->
    [(category): datastore.execute {
        select count
        from posts
        where categories == category.name
    }]
}

forward '/WEB-INF/pages/admin/adminCategories.gtpl'
