(ns simple-billy-api.specs.job-posting-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def job-posting-filter-data
  {
   (ds/opt :page) int?
   (ds/opt :pageSize) int?
   (ds/opt :status) string?
   })

(def job-posting-filter-spec
  (ds/spec
    {:name ::job-posting-filter
     :spec job-posting-filter-data}))
