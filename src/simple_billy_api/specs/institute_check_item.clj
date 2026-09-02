(ns simple-billy-api.specs.institute-check-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def institute-check-item-data
  {
   (ds/req :exists) boolean?
   (ds/req :name) string?
   (ds/req :source) string?
   })

(def institute-check-item-spec
  (ds/spec
    {:name ::institute-check-item
     :spec institute-check-item-data}))
