import useSWR from "swr";

export function useCategies() {
  const API_URL = "https://deployreciclame-production.up.railway.app/posts/categories/all";

  const fetcher = (url) => fetch(url).then((res) => res.json());
  const { data, error, isValidating } = useSWR(API_URL, fetcher, {
    refreshInterval: 1000,
  });
  return {
    categories: data,
    error,
    isLoading: !data && !error,
    isValidating,
  };
}
