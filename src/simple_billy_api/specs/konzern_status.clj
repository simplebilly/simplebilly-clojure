(ns simple-billy-api.specs.konzern-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.konzern-beteiligung :refer :all]
            [simple-billy-api.specs.konzern-thresholds :refer :all]
            )
  (:import (java.io File)))


(def konzern-status-data
  {
   (ds/req :groessenbefreit) boolean?
   (ds/req :kapitalmarktorientiert) boolean?
   (ds/req :konzernabschlusspflicht) boolean?
   (ds/req :missing_group_figures) boolean?
   (ds/req :mutterunternehmen) boolean?
   (ds/opt :parent_name) string?
   (ds/opt :parent_situs) string?
   (ds/req :participations) (s/coll-of konzern-beteiligung-spec)
   (ds/req :thresholds) konzern-thresholds-spec
   (ds/req :year) int?
   (ds/req :zwischenholding_befreit) boolean?
   (ds/opt :zwischenholding_hinweis) string?
   })

(def konzern-status-spec
  (ds/spec
    {:name ::konzern-status
     :spec konzern-status-data}))
