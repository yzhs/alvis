/*
 * Copyright (c) 2011 Dominik Dingel, Sebastian Schmitz
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.unisiegen.informatik.bs.alvis.vm;

/**

 */
import java.util.Map;
import java.util.List;
import java.util.concurrent.locks.Lock;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public interface AbstractAlgo extends Runnable {

	/**
	 * @return Reference of all Variables, held by the algo
	 */
	public List<PCObject> getVariableReferences();

	/**
	 * @return Null Objects for all Datatypes the algo expects for the
	 *         setParameters Call
	 */
	public Map<String, PCObject> getParameterTypes();

	/**
	 * @param paras
	 *            are the Startparameters of the algo, have to passed like
	 *            specified in getParameterTypes
	 */
	public void setParameters(Map<String, PCObject> paras);

	/**
	 * @param wantToListen
	 *            Breakpoint listener, will be informed in case of an Breakpoint
	 *            event, currently only one Listener can be active at the same
	 *            time, could be delete with passing a null Object as BPListener
	 */
	public void addBPListener(BPListener wantToListen);

	/**
	 * @param wantToListen
	 *            Decision Point listener, will be informed in case of an
	 *            Decision Point event, currently only one Listener can be
	 *            active at the same time, could be delete with passing a null
	 *            Object as DPListener
	 */
	public void addDPListener(DPListener wantToListen);

	/**
	 * set own Break Field, should be used in context with Thread.notify
	 */
	public void stopBreak();

	/**
	 * @deprecated will be removed in future alvis versions lock handled on all
	 *             threads
	 */
	public void setLock(Lock toLockOn);

	/**
	 * should be used to signalize a Thread to leave it's run method
	 */
	public void kill();
}
