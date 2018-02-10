package com.quran.labs.androidquran.data

import android.view.Display
import com.quran.data.page.provider.QuranPageProvider
import com.quran.data.source.QuranDataSourceProvider
import dagger.Module
import dagger.Provides

@Module
object QuranDataModule {
  @JvmStatic @Provides fun provideQuranDataSource() =
      QuranDataSourceProvider.provideNaskhDataSource()

  @JvmStatic fun provideQuranPageProvider(display: Display) =
      QuranPageProvider.provideNaskhPageProvider(display)
}