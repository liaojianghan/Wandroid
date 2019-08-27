package io.github.iamyours.wandroid.adapter

import io.github.iamyours.wandroid.R
import io.github.iamyours.wandroid.databinding.ItemQaBinding
import io.github.iamyours.wandroid.ui.web.WebActivity
import io.github.iamyours.wandroid.vo.ArticleVO

class QaAdapter : DataBoundAdapter<ArticleVO, ItemQaBinding>() {
    override fun initView(binding: ItemQaBinding, item: ArticleVO) {
        binding.vo = item
        binding.root.setOnClickListener {
            WebActivity.nav(item.link, it.context)
        }
    }

    override val layoutId: Int
        get() = R.layout.item_qa
}