package org.andengine.entity.scene;

import org.andengine.input.touch.TouchEvent;

/**
 * An interface for a callback to be invoked when a {@link org.andengine.input.touch.TouchEvent} is
 * dispatched to an {@link org.andengine.entity.scene.ITouchArea} area. The callback will be invoked
 * before the {@link org.andengine.input.touch.TouchEvent} is passed to the {@link org.andengine.entity.scene.ITouchArea}.
 *
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 15:01:48 PM - 27.03.2012
 */
public interface IOnAreaTouchListener {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * Called when a {@link org.andengine.input.touch.TouchEvent} is dispatched to an {@link org.andengine.entity.scene.ITouchArea}. This allows
	 * listeners to get a chance to respond before the target {@link org.andengine.entity.scene.ITouchArea#onAreaTouched(org.andengine.input.touch.TouchEvent, float, float)} is called.
	 * 
	 * @param pTouchArea The {@link org.andengine.entity.scene.ITouchArea} that the {@link org.andengine.input.touch.TouchEvent} has been dispatched to.
	 * @param pSceneTouchEvent The {@link org.andengine.input.touch.TouchEvent} object containing full information about the event.
	 * @param pTouchAreaLocalX the x coordinate within the area touched.
	 * @param pTouchAreaLocalY the y coordinate within the area touched.
	 * 
	 * @return <code>true</code> if this {@link org.andengine.entity.scene.IOnAreaTouchListener} has consumed the {@link org.andengine.input.touch.TouchEvent}, <code>false</code> otherwise.
	 */
	public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final ITouchArea pTouchArea, final float pTouchAreaLocalX, final float pTouchAreaLocalY);
}