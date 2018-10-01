
///
// Implementing CookieName Class which implements the Container interface,  the inner class NameIterator implements the Iterator interface
///

public class CookieNameRepository implements Container{
	public String names[] = {"Brown", "Red"};
	@Override
	public Iterator getIterator() {
		return new CookieNameIterator();
	}
	
	private class CookieNameIterator implements Iterator {
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
