(ns simple-billy-api.specs.stock-transfer-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def stock-transfer-status-update-data
  {
   (ds/req :status) string?
   })

(def stock-transfer-status-update-spec
  (ds/spec
    {:name ::stock-transfer-status-update
     :spec stock-transfer-status-update-data}))
