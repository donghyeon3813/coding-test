import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genreTotal.put(genres[i], genreTotal.getOrDefault(genres[i], 0) + plays[i]);
            genreSongs.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{i, plays[i]});
        }

        List<String> sortedGenres = new ArrayList<>(genreTotal.keySet());
        sortedGenres.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));

        List<Integer> answer = new ArrayList<>();

        for (String genre : sortedGenres) {
            List<int[]> songs = genreSongs.get(genre);
            
            songs.sort((a, b) -> a[1] == b[1] ? a[0] - b[0] : b[1] - a[1]);

            int limit = Math.min(songs.size(), 2);
            for (int i = 0; i < limit; i++) {
                answer.add(songs.get(i)[0]);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}