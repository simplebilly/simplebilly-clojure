(ns simple-billy-api.specs.training-content
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.contact-info :refer :all]
            [simple-billy-api.specs.quiz-question :refer :all]
            [simple-billy-api.specs.section :refer :all]
            )
  (:import (java.io File)))


(def training-content-data
  {
   (ds/req :code) string?
   (ds/req :contact) contact-info-spec
   (ds/req :passScore) int?
   (ds/req :quiz) (s/coll-of quiz-question-spec)
   (ds/req :sections) (s/coll-of section-spec)
   (ds/req :title) string?
   (ds/req :titleEn) string?
   })

(def training-content-spec
  (ds/spec
    {:name ::training-content
     :spec training-content-data}))
