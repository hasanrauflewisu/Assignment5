 

///
// Implementing CakeName Class which implements the Container interface,  the inner class NameIterator implements the Iterator interface
///
public class CakeNameRepository implements Container{
	public String names[] = {"strawberry", "Chochlate"};
	@Override
	public Iterator getIterator() {
		return new CakeNameIterator();
	}
	
	private class CakeNameIterator implements Iterator {
		int index;
		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}
		
		@Override
		public Object next() {
		   if (this.hasNext()) {
			   return names[index++];
		   }
		   return null;
		}
	}
}
