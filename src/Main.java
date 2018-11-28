
import data.BookEntity;
import org.hibernate.Session;
import util.HibernateUtil;

public class Main {
    /*private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }*/

    public static void main(final String[] args){


        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        BookEntity newBookEntity = new BookEntity();
        newBookEntity.setIsbn("12345678");
        newBookEntity.setBookName("Libro de Hibernate");

        session.save(newBookEntity);

        session.getTransaction().commit();
        session.close();
        /*final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
            for (Object key : metadataMap.keySet()) {

                final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
                final String entityName = classMetadata.getEntityName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
                System.out.println("Dando de alta");

            }
        } finally {
            session.close();
        }*/
    }
}