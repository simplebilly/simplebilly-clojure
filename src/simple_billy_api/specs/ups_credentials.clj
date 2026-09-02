(ns simple-billy-api.specs.ups-credentials
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ups-credentials-data
  {
   (ds/req :client_id) string?
   (ds/req :client_secret) string?
   (ds/opt :shipper_number) string?
   })

(def ups-credentials-spec
  (ds/spec
    {:name ::ups-credentials
     :spec ups-credentials-data}))
