import com.google.appengine.api.datastore.Entity

def contact = new Entity('contact-me')

contact.save()

//request.contact-me = datastore.execute { select all from contact }

forward '/WEB-INF/pages/contact-me.gtpl'
