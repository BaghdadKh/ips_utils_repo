//    IPS Java Utils
//    (c) Copyright 2009-2011
//    Institute of Phonetics and Speech Processing,
//    Ludwig-Maximilians-University, Munich, Germany
//
//
//    This file is part of IPS Java Utils
//
//
//    IPS Java Utils is free software: you can redistribute it and/or modify
//    it under the terms of the GNU Lesser General Public License as published by
//    the Free Software Foundation, version 3 of the License.
//
//    IPS Java Utils is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU Lesser General Public License for more details.
//
//    You should have received a copy of the GNU Lesser General Public License
//    along with IPS Java Utils.  If not, see <http://www.gnu.org/licenses/>.


package ipsk.xml;

/**
 * @version $Id: DOMConverterException.java,v 1.7 2011/04/07 19:39:10 klausj Exp $
 * @author K.Jaensch, klausj@phonetik.uni-muenchen.de
 *
 */

/**
 * @author K.Jaensch, klausj@phonetik.uni-muenchen.de
 *
 */
public class DOMConverterException extends Exception {

	/**
	 * 
	 */
	public DOMConverterException() {
		super();
	}

	/**
	 * @param message
	 */
	public DOMConverterException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DOMConverterException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public DOMConverterException(Throwable cause) {
		super(cause);
	}

}
