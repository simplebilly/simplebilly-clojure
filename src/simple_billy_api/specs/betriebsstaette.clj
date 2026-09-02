(ns simple-billy-api.specs.betriebsstaette
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def betriebsstaette-data
  {
   (ds/req :beschaefigte) int?
   (ds/req :name) string?
   })

(def betriebsstaette-spec
  (ds/spec
    {:name ::betriebsstaette
     :spec betriebsstaette-data}))
