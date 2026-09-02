(ns simple-billy-api.specs.gez-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.betriebsstaetten-detail :refer :all]
            )
  (:import (java.io File)))


(def gez-report-data
  {
   (ds/req :beitragsfreie_kfz) int?
   (ds/req :beitragspflichtige_kfz) int?
   (ds/req :betriebsstaetten) (s/coll-of betriebsstaetten-detail-spec)
   (ds/req :hinweis) string?
   (ds/req :hotelzimmer_beitrag) string?
   (ds/req :jaehrlicher_beitrag) string?
   (ds/req :jahr) int?
   (ds/req :kfz_beitrag) string?
   (ds/req :monatlicher_beitrag) string?
   (ds/req :vierteljaehrlicher_beitrag) string?
   })

(def gez-report-spec
  (ds/spec
    {:name ::gez-report
     :spec gez-report-data}))
