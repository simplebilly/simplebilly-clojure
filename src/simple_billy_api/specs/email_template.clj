(ns simple-billy-api.specs.email-template
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.email-template-status :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def email-template-data
  {
   (ds/req :body) string?
   (ds/req :name) string?
   (ds/req :status) email-template-status-spec
   (ds/req :subject) string?
   (ds/opt :variables) any-type-spec
   })

(def email-template-spec
  (ds/spec
    {:name ::email-template
     :spec email-template-data}))
