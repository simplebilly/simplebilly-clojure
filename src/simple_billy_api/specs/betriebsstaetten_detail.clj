(ns simple-billy-api.specs.betriebsstaetten-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def betriebsstaetten-detail-data
  {
   (ds/req :beschaefigte) int?
   (ds/req :monatlicher_beitrag) string?
   (ds/req :name) string?
   })

(def betriebsstaetten-detail-spec
  (ds/spec
    {:name ::betriebsstaetten-detail
     :spec betriebsstaetten-detail-data}))
