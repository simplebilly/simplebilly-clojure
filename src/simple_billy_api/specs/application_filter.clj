(ns simple-billy-api.specs.application-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def application-filter-data
  {
   (ds/opt :page) int?
   (ds/opt :pageSize) int?
   (ds/opt :postingId) uuid?
   (ds/opt :status) string?
   })

(def application-filter-spec
  (ds/spec
    {:name ::application-filter
     :spec application-filter-data}))
