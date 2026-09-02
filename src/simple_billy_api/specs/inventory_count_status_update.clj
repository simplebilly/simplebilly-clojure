(ns simple-billy-api.specs.inventory-count-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inventory-count-status-update-data
  {
   (ds/req :status) string?
   })

(def inventory-count-status-update-spec
  (ds/spec
    {:name ::inventory-count-status-update
     :spec inventory-count-status-update-data}))
