package ru.ex.myapp

data class CharacterDataWrapper(
    var code: Int,
    var status: String,
    var copyright: String,
    var attributionText: String,
    var attributionHTML: String,
    var data: CharacterDataContainer,
    var etag: String
)

data class CharacterDataContainer(
    var offset: Int,
    var limit: Int,
    var total: Int,
    var count: Int,
    var results: List<Character>
)

data class Character(
    var id: Int,
    var name: String,
    var description: String,
    var modified: String, //Date
    var resourceURI: String,
    var urls: List<Url>,
    var thumbnail: Image,
    var comics: ComicList,
    var stories: StoryList,
    var events: EventList,
    var series: SeriesList,
)

data class Url(
    var type: String,
    var url: String
)

data class Image(
    var path: String,
    var extension: String,
)

data class ComicList(
    var available: Int,
    var returned: Int,
    var collectionURI: String,
    var items: List<ComicSummary>
)

data class ComicSummary(
    var resourceURI: String,
    var name: String,
)

data class StoryList(
    var available: Int,
    var returned: Int,
    var collectionURI: String,
    var items: List<StorySummary>,
)

data class StorySummary(
    var resourceURI: String,
    var name: String,
    var type: String,
)

data class EventList(
    var available: Int,
    var returned: Int,
    var collectionURI: String,
    var items: List<EventSummary>,
)

data class EventSummary(
    var resourceURI: String,
    var name: String,
)

data class SeriesList(
    var available: Int,
    var returned: Int,
    var collectionURI: String,
    var items: List<SeriesSummary>,
)

data class SeriesSummary(
    var resourceURI: String,
    var name: String,
)
