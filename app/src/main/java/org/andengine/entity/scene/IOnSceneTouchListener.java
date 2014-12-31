package org.andengine.entity.scene;

import org.andengine.input.touch.TouchEvent;

/**
 * An interface for a callback to be invoked when a {@link org.andengine.input.touch.TouchEvent} is
 * dispatched to a {@link org.andengine.entity.scene.Scene}. The callback will be invoked
 * after all {@link org.andengine.entity.scene.ITouchArea}s have been checked and none consumed the {@link org.andengine.input.touch.TouchEvent}.
 *
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 15:02:20 - 27.03.2012
 */
public interface IOnSceneTouchListener {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Called when a {@link org.andengine.input.touch.TouchEvent} is dispatched to a {@link org.andengine.entity.scene.Scene}.
	 * 
	 * @param pScene The {@link org.andengine.entity.scene.Scene} that the {@link org.andengine.input.touch.TouchEvent} has been dispatched to.
	 * @param pSceneTouchEvent The {@link org.andengine.input.touch.TouchEvent} object containing full information about the event.
	 * 
	 * @return <code>true</code> if this {@link org.andengine.entity.scene.IOnSceneTouchListener} has consumed the {@link org.andengine.input.touch.TouchEvent}, <code>false</code> otherwise.
	 */
	public boolean onSceneTouchEvent(final Scene pScene, final TouchEvent pSceneTouchEvent);
}