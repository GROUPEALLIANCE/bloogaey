//import static bloogy.Post

def title = params.title
//def posting  Post.findAll{title==params.title}
def post = datastore.get('posts', title)
//if (!post){post=posting}
if (post) {
    request.post = post
    forward '/WEB-INF/pages/article.gtpl'
} else {
     
    request.title = params.title
    forward '/WEB-INF/pages/notFound.gtpl'
}
