(ns simple-billy-api.specs.hebesatz-lookup
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hebesatz-lookup-data
  {
   (ds/req :bundesland) string?
   (ds/req :country_code) string?
   (ds/req :gemeinde_name) string?
   (ds/req :gemeindeschluessel) string?
   (ds/req :hebesatz_gewerbesteuer) float?
   (ds/opt :hebesatz_grundsteuer_b) float?
   (ds/req :jahr) int?
   (ds/opt :landkreis) string?
   (ds/req :valid_from) string?
   (ds/opt :valid_to) string?
   })

(def hebesatz-lookup-spec
  (ds/spec
    {:name ::hebesatz-lookup
     :spec hebesatz-lookup-data}))
