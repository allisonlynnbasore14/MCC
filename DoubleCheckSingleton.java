
class Singleton{

	private volatile static Singleton _instance;

	private Singleton(){

	}

	public class Singleton(){
		if ( _instance == null){
			synchronized (Singleton class){
				if (_instance == null){
					_instance = new Singleton();
				}
			}
		}
		return _instance;
	}

}