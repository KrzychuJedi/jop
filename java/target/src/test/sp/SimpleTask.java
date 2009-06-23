/*
  This file is part of JOP, the Java Optimized Processor
    see <http://www.jopdesign.com/>

  Copyright (C) 2009, Martin Schoeberl (martin@jopdesign.com)

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/


/**
 * 
 */
package sp;

/**
 * The base class for simple tasks on a CMP based single-path system.
 * 
 * @author Martin Schoeberl (martin@jopdesign.com)
 *
 */
public class SimpleTask {

	/**
	 * Perform read access to shared data.
	 */
	public void read() {
	}
	
	/**
	 * Execute task logic. Read and write access to shared data is forbidden.
	 */
	public void execute() {
	}
	
	/**
	 * Write results to the shared memory.
	 */
	public void write() {
	}
}