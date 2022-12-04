package ru.avsematkin.srezapp2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.avsematkin.srezapp2.adapter.NewsAdapter
import ru.avsematkin.srezapp2.adapter.TrendsAdapter
import ru.avsematkin.srezapp2.common.Common
import ru.avsematkin.srezapp2.databinding.FragmentMainBinding
import ru.avsematkin.srezapp2.model.Cover
import ru.avsematkin.srezapp2.model.Films

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentMainBinding.inflate(inflater)

        Common.service.getCover().enqueue(object: Callback<Cover> {
            override fun onResponse(call: Call<Cover>, response: Response<Cover>) {
                Glide.with(requireActivity())
                    .load(response.body()!![0].image)
                    .into(binding.ivCover)
            }

            override fun onFailure(call: Call<Cover>, t: Throwable) {
                Toast.makeText(requireContext(),  "Проверьте интернет-подключение, картинка не загружена", Toast.LENGTH_SHORT).show()
            }
        })

        Common.service.getTrends().enqueue(object: Callback<Films>{
            override fun onResponse(call: Call<Films>, response: Response<Films>) {
               binding.rvTrends.adapter = TrendsAdapter(requireActivity(), response.body()!!)
                binding.rvTrends.layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            }

            override fun onFailure(call: Call<Films>, t: Throwable) {
                Toast.makeText(requireContext(),  "Проверьте интернет-подключение, список фильмов не загружен", Toast.LENGTH_SHORT).show()
            }

        })

        Common.service.getNews().enqueue(object: Callback<Films>{
            override fun onResponse(call: Call<Films>, response: Response<Films>) {
                binding.rvTrends.adapter = NewsAdapter(requireActivity(), response.body()!!)
                binding.rvTrends.layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            }

            override fun onFailure(call: Call<Films>, t: Throwable) {
                Toast.makeText(requireContext(),  "Проверьте интернет-подключение, список фильмов не загружен", Toast.LENGTH_SHORT).show()
            }
        })
        Common.service.getPersonal().enqueue(object: Callback<Films>{
            override fun onResponse(call: Call<Films>, response: Response<Films>) {
                binding.rvPersonal.adapter = TrendsAdapter(requireActivity(), response.body()!!)
                binding.rvPersonal.layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            }

            override fun onFailure(call: Call<Films>, t: Throwable) {
                Toast.makeText(requireContext(),  "Проверьте интернет-подключение, список фильмов не загружен", Toast.LENGTH_SHORT).show()
            }
        })

        return binding.root

    }
}