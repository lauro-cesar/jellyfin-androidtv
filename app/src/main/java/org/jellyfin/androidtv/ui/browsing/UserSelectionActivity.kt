package org.jellyfin.androidtv.ui.browsing

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.replace
import org.jellyfin.androidtv.FullscreenMainWelcomeScreenActivity
import org.jellyfin.androidtv.MainWelcomeScreenActivity
import org.jellyfin.androidtv.R
import org.jellyfin.androidtv.WelcomeTestScreenActivity
import org.jellyfin.androidtv.constant.Extras
import org.jellyfin.androidtv.data.service.BackgroundService
import org.jellyfin.androidtv.ui.home.HomeFragment
import org.jellyfin.androidtv.ui.home.HomeFragmentLiveTVRow
import org.jellyfin.androidtv.ui.home.HomeToolbarFragment
import org.jellyfin.androidtv.ui.livetv.LiveTvGuideActivity
import org.jellyfin.androidtv.ui.shared.BaseActivity
import org.koin.android.ext.android.inject
import org.jellyfin.androidtv.ui.livetv.TvManager
import org.jellyfin.androidtv.ui.startup.StartupActivity
import org.jellyfin.apiclient.model.dto.BaseItemDto

class UserSelectionActivity : FragmentActivity(R.layout.fragment_content_view) {
	private val backgroundService: BackgroundService by inject<BackgroundService>()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)





		supportFragmentManager
			.beginTransaction()
			.replace<HomeToolbarFragment>(R.id.content_view)
			.add<HomeFragment>(R.id.content_view)
			.commit()
		backgroundService.attach(this)


//		intent = Intent(this, BrowseRecordingsActivity::class.java)


//		intent = Intent(this, LiveTvGuideActivity::class.java)
//		intent = Intent(this, BrowseScheduleActivity::class.java)
//		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//		startActivity(intent)





	}
}
