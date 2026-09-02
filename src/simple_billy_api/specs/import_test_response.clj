(ns simple-billy-api.specs.import-test-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def import-test-response-data
  {
   (ds/opt :error) string?
   (ds/req :ok) boolean?
   })

(def import-test-response-spec
  (ds/spec
    {:name ::import-test-response
     :spec import-test-response-data}))
